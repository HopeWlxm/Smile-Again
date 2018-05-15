<aside class="app-sidebar">
    <div class="app-sidebar__user"><img class="app-sidebar__user-avatar" src="/images/4.jpg" alt="User Image">
        <div>
            <p class="app-sidebar__user-name">Zhang Oba</p>
            <p class="app-sidebar__user-designation">Frontend Developer</p>
        </div>
    </div>
    <ul class="app-menu">
        <li>
            <a class="app-menu__item active" href="/index"><i class="app-menu__icon fa fa-dashboard"></i><span
                    class="app-menu__label">Dashboard</span></a>
        </li>
        <shiro:hasPermission name="user:query">
            <li class="treeview">
                <a class="app-menu__item" href="/user/user-list" data-toggle="treeview"><i
                        class="app-menu__icon fa fa-address-card"></i><span
                        class="app-menu__label">User Manager</span><i
                        class="treeview-indicator fa fa-angle-right"></i></a>
                <ul class="treeview-menu">
                    <li>
                        <a class="treeview-item" href="/user/user-list"><i class="icon fa fa-circle-o"></i>
                            User Query</a>
                    </li>
                    <li>
                        <a class="treeview-item" href="/user/user-add"><i class="icon fa fa-circle-o"></i>
                            User Add</a>
                    </li>
                </ul>
            </li>
        </shiro:hasPermission>
        <li class="treeview">
            <a class="app-menu__item" href="#" data-toggle="treeview"><i
                    class="app-menu__icon fa fa-laptop"></i><span class="app-menu__label">UI Elements</span><i
                    class="treeview-indicator fa fa-angle-right"></i></a>
            <ul class="treeview-menu">
                <li>
                    <a class="treeview-item" href="/admin/bootstrap-components"><i class="icon fa fa-circle-o"></i>
                        Bootstrap Elements</a>
                </li>
                <li>
                    <a class="treeview-item" href="https://fontawesome.com/v4.7.0/icons/" target="_blank"
                       rel="noopener"><i class="icon fa fa-circle-o"></i> Font Icons</a>
                </li>
                <li>
                    <a class="treeview-item" href="/admin/ui-cards"><i class="icon fa fa-circle-o"></i> Cards</a>
                </li>
                <li>
                    <a class="treeview-item" href="/admin/widgets"><i class="icon fa fa-circle-o"></i> Widgets</a>
                </li>
            </ul>
        </li>
        <li><a class="app-menu__item" href="/admin/charts"><i class="app-menu__icon fa fa-pie-chart"></i><span
                class="app-menu__label">Charts</span></a></li>
        <li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i
                class="app-menu__icon fa fa-edit"></i><span class="app-menu__label">Forms</span><i
                class="treeview-indicator fa fa-angle-right"></i></a>
            <ul class="treeview-menu">
                <li><a class="treeview-item" href="/admin/form-components"><i class="icon fa fa-circle-o"></i> Form
                    Components</a>
                </li>
                <li><a class="treeview-item" href="/admin/form-custom"><i class="icon fa fa-circle-o"></i> Custom
                    Components</a></li>
                <li><a class="treeview-item" href="/admin/form-samples"><i class="icon fa fa-circle-o"></i> Form Samples</a>
                </li>
                <li><a class="treeview-item" href="/admin/form-notifications"><i class="icon fa fa-circle-o"></i> Form
                    Notifications</a></li>
            </ul>
        </li>
        <li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i
                class="app-menu__icon fa fa-th-list"></i><span class="app-menu__label">Tables</span><i
                class="treeview-indicator fa fa-angle-right"></i></a>
            <ul class="treeview-menu">
                <li><a class="treeview-item" href="/admin/table-basic"><i class="icon fa fa-circle-o"></i> Basic Tables</a>
                </li>
                <li><a class="treeview-item" href="/admin/table-data-table"><i class="icon fa fa-circle-o"></i> Data
                    Tables</a>
                </li>
            </ul>
        </li>
        <li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i
                class="app-menu__icon fa fa-file-text"></i><span class="app-menu__label">Pages</span><i
                class="treeview-indicator fa fa-angle-right"></i></a>
            <ul class="treeview-menu">
                <li><a class="treeview-item" href="/admin/blank-page"><i class="icon fa fa-circle-o"></i> Blank Page</a>
                </li>
                <li><a class="treeview-item" href="/admin/page-login"><i class="icon fa fa-circle-o"></i> Login Page</a>
                </li>
                <li><a class="treeview-item" href="/admin/page-lockscreen"><i class="icon fa fa-circle-o"></i>
                    Lockscreen Page</a>
                </li>
                <li><a class="treeview-item" href="/admin/page-user"><i class="icon fa fa-circle-o"></i> User Page</a>
                </li>
                <li><a class="treeview-item" href="/admin/page-invoice"><i class="icon fa fa-circle-o"></i> Invoice Page</a>
                </li>
                <li><a class="treeview-item" href="/admin/page-calendar"><i class="icon fa fa-circle-o"></i> Calendar
                    Page</a>
                </li>
                <li><a class="treeview-item" href="/admin/page-mailbox"><i class="icon fa fa-circle-o"></i> Mailbox</a>
                </li>
                <li><a class="treeview-item" href="/admin/page-error"><i class="icon fa fa-circle-o"></i> Error Page</a>
                </li>
            </ul>
        </li>
    </ul>
</aside>