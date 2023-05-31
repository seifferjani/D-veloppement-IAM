@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // getters and setters
}

@Entity
public class UsersRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Role role;

    // getters and setters
}

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }

    public void deleteRole(Long roleId) {
        roleRepository.deleteById(roleId);
    }

    public Role getRoleById(Long roleId) {
        return roleRepository.findById(roleId).orElse(null);
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}

@Service
public class UsersRoleService {
    private final UsersRoleRepository usersRoleRepository;

    public UsersRoleService(UsersRoleRepository usersRoleRepository) {
        this.usersRoleRepository = usersRoleRepository;
    }

    public UsersRole createUserRole(UsersRole usersRole) {
        return usersRoleRepository.save(usersRole);
    }

    public UsersRole updateUserRole(UsersRole usersRole) {
        return usersRoleRepository.save(usersRole);
    }

    public void deleteUserRole(Long usersRoleId) {
        usersRoleRepository.deleteById(usersRoleId);
    }

    public UsersRole getUserRoleById(Long usersRoleId) {
        return usersRoleRepository.findById(usersRoleId).orElse(null);
    }

    public List<UsersRole> getAllUserRoles() {
        return usersRoleRepository.findAll();
    }
}
