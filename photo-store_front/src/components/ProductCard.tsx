"use client";

import { useState } from "react";

//Componente de exemplo
type ProductCardProps = {
    name: string;
    price: number;
    imageUrl: string;
}


export default function ProductCard({ name, price, imageUrl }: ProductCardProps) {
  const [quantity, setQuantity] = useState(0);

  return (
    <div className="max-w-sm rounded-2xl shadow-md p-4 bg-white">
      <img
        src={imageUrl}
        alt={name}
        className="w-full h-48 object-cover rounded-xl"
      />
      <h2 className="text-xl font-semibold mt-2">{name}</h2>
      <p className="text-gray-600">R$ {price.toFixed(2)}</p>

      <div className="flex items-center gap-2 mt-3">
        <button
          onClick={() => setQuantity(quantity - 1)}
          disabled={quantity === 0}
          className="px-3 py-1 bg-gray-300 rounded-xl disabled:opacity-50"
        >
          -
        </button>
        <span>{quantity}</span>
        <button
          onClick={() => setQuantity(quantity + 1)}
          className="px-3 py-1 bg-blue-600 text-white rounded-xl hover:bg-blue-700"
        >
          +
        </button>
      </div>
    </div>
  );
}