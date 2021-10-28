package io.burkard.cdk.services.glue

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PrincipalPrivilegesProperty {

  def apply(
    permissions: Option[List[String]] = None,
    principal: Option[software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty] = None
  ): software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty =
    (new software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty.Builder)
      .permissions(permissions.map(_.asJava).orNull)
      .principal(principal.orNull)
      .build()
}
