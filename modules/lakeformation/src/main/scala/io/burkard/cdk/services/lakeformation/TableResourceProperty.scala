package io.burkard.cdk.services.lakeformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TableResourceProperty {

  def apply(
    name: Option[String] = None,
    tableWildcard: Option[software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWildcardProperty] = None,
    catalogId: Option[String] = None,
    databaseName: Option[String] = None
  ): software.amazon.awscdk.services.lakeformation.CfnPermissions.TableResourceProperty =
    (new software.amazon.awscdk.services.lakeformation.CfnPermissions.TableResourceProperty.Builder)
      .name(name.orNull)
      .tableWildcard(tableWildcard.orNull)
      .catalogId(catalogId.orNull)
      .databaseName(databaseName.orNull)
      .build()
}
