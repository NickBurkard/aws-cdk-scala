package io.burkard.cdk.services.lakeformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseResourceProperty {

  def apply(
    name: Option[String] = None,
    catalogId: Option[String] = None
  ): software.amazon.awscdk.services.lakeformation.CfnPermissions.DatabaseResourceProperty =
    (new software.amazon.awscdk.services.lakeformation.CfnPermissions.DatabaseResourceProperty.Builder)
      .name(name.orNull)
      .catalogId(catalogId.orNull)
      .build()
}
