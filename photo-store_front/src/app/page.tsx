import ProductCard from "@/components/ProductCard";
import Image from "next/image";


export default function Home() {
  return (
    <main className="">
      <ProductCard name="Teste1" price={123} imageUrl="vapo"/>      
    </main>
  );
}
