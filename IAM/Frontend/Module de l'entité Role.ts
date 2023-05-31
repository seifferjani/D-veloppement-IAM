@NgModule({
  imports: [CommonModule, HttpClientModule, RouterModule.forChild(routes)],
  declarations: [RoleListComponent, RoleDetailComponent, RoleFormComponent],
  providers: [RoleService]
})
export class RoleModule {}
