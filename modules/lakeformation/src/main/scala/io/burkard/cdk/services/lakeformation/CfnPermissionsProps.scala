package io.burkard.cdk.services.lakeformation

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPermissionsProps {

  def apply(
    dataLakePrincipal: software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLakePrincipalProperty,
    resource: software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty,
    permissionsWithGrantOption: Option[List[String]] = None,
    permissions: Option[List[String]] = None
  ): software.amazon.awscdk.services.lakeformation.CfnPermissionsProps =
    (new software.amazon.awscdk.services.lakeformation.CfnPermissionsProps.Builder)
      .dataLakePrincipal(dataLakePrincipal)
      .resource(resource)
      .permissionsWithGrantOption(permissionsWithGrantOption.map(_.asJava).orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .build()
}
