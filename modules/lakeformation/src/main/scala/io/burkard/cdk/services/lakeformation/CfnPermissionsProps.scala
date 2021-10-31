package io.burkard.cdk.services.lakeformation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPermissionsProps {

  def apply(
    permissionsWithGrantOption: Option[List[String]] = None,
    dataLakePrincipal: Option[software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLakePrincipalProperty] = None,
    permissions: Option[List[String]] = None,
    resource: Option[software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty] = None
  ): software.amazon.awscdk.services.lakeformation.CfnPermissionsProps =
    (new software.amazon.awscdk.services.lakeformation.CfnPermissionsProps.Builder)
      .permissionsWithGrantOption(permissionsWithGrantOption.map(_.asJava).orNull)
      .dataLakePrincipal(dataLakePrincipal.orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .resource(resource.orNull)
      .build()
}
