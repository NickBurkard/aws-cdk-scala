package io.burkard.cdk.services.lakeformation

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPermissions {

  def apply(
    internalResourceId: String,
    permissionsWithGrantOption: Option[List[String]] = None,
    dataLakePrincipal: Option[software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLakePrincipalProperty] = None,
    permissions: Option[List[String]] = None,
    resource: Option[software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lakeformation.CfnPermissions =
    software.amazon.awscdk.services.lakeformation.CfnPermissions.Builder
      .create(stackCtx, internalResourceId)
      .permissionsWithGrantOption(permissionsWithGrantOption.map(_.asJava).orNull)
      .dataLakePrincipal(dataLakePrincipal.orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .resource(resource.orNull)
      .build()
}