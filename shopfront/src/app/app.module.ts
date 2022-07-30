import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HomeComponent } from './components/home/home.component';
import { FooterComponent } from './components/footer/footer.component';
import { ViewProductComponent } from './components/view-product/view-product.component';
import { ProductsComponent } from './components/products/products.component';
import { RegisterComponent } from './components/register/register.component';
import { LoginComponent } from './components/login/login.component';
import { ViewCartComponent } from './components/view-cart/view-cart.component';
import { PaymentGatewayComponent } from './components/payment-gateway/payment-gateway.component';

import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { FrontpageComponent } from './components/frontpage/frontpage.component';
import { NextfrontpageComponent } from './components/nextfrontpage/nextfrontpage.component';
import { ViewwishlistComponent } from './components/viewwishlist/viewwishlist.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    FooterComponent,
    ViewProductComponent,
    ProductsComponent,
    RegisterComponent,
    LoginComponent,
    ViewCartComponent,
    PaymentGatewayComponent,
  
    FrontpageComponent,
    NextfrontpageComponent,
    ViewwishlistComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
