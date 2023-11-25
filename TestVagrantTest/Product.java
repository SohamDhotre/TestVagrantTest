class Product {
        private String productName;
        private double price;
        private int percentage;
        private int quantity;

        public Product(String productName, double price, int percentage, int quantity) {
            this.productName = productName;
            this.price = price;
            this.percentage = percentage;
            this.quantity = quantity;
        }

        public String getProductName() {
            return productName;
        }

        public double getPrice() {
            return price;
        }

        public int getPercentage() {
            return percentage;
        }

        public int getQuantity() {
            return quantity;
        }
    }