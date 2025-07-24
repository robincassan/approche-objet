package fr.diginamic.combat;

    public class Potion {
        private PotionType type;
        private int effet;
        private int duree;

        public Potion(PotionType type, int effet, int duree) {
            this.type = type;
            this.effet = effet;
            this.duree = duree;
        }

        public void appliquer(Personnage p) {
            switch (type) {
                case SOIN -> p.soigner(effet);
                case ATTAQUE_MINEURE, ATTAQUE_MAJEURE -> p.appliquerBonusAttaque(effet, duree);
            }
        }

        public PotionType getType() {
            return type;
        }

        public String toString() {
            return type + " (effet: " + effet + ", durée: " + duree + ")";
        }
}
