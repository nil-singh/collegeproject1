import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { ProductsComponent } from './components/products/products.component';
import { ViewProductComponent } from './components/view-product/view-product.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { ViewCartComponent } from './components/view-cart/view-cart.component';
// import { ViewWishlistComponent } from './components/view-wishlist/view-wishlist.component';
import { PaymentGatewayComponent } from './components/payment-gateway/payment-gateway.component';
import { NextfrontpageComponent } from './components/nextfrontpage/nextfrontpage.component';
import { FrontpageComponent } from './components/frontpage/frontpage.component';
import { ViewwishlistComponent } from './components/viewwishlist/viewwishlist.component';
const routes: Routes = [

  // {path: '', component:FrontpageComponent},
  {path:'',redirectTo:'home',pathMatch:'full'},
  { path: 'home', component:HomeComponent },
  { path: 'products', component: ProductsComponent },
  { path: 'viewproduct', component: ViewProductComponent},
  { path: 'login', component: LoginComponent},
  { path: 'register', component:RegisterComponent},
  { path: 'viewcart', component:ViewCartComponent },
  { path: 'viewwishlist', component:ViewwishlistComponent },
  { path: 'paymentgateway', component:PaymentGatewayComponent },
  { path: 'nextfrontpage', component:NextfrontpageComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
