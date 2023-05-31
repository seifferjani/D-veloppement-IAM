@Injectable()
export class RoleService {
  private apiUrl = '/api/roles';

  constructor(private http: HttpClient) {}

  getRoles(): Observable<Role[]> {
    return this.http.get<Role[]>(this.apiUrl);
  }

  createRole(role: Role): Observable<Role> {
    return this.http.post<Role>(this.apiUrl, role);
  }

  updateRole(roleId: string, role: Role): Observable<Role> {
    const url = `${this.apiUrl}/${roleId}`;
    return this.http.put<Role>(url, role);
  }

  deleteRole(roleId: string): Observable<void> {
    const url = `${this.apiUrl}/${roleId}`;
    return this.http.delete<void>(url);
  }

  getRoleById(roleId: string): Observable<Role> {
    const url = `${this.apiUrl}/${roleId}`;
    return this.http.get<Role>(url);
  }
}
