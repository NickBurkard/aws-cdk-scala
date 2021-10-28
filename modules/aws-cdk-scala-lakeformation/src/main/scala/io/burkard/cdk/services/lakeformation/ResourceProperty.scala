package io.burkard.cdk.services.lakeformation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceProperty {

  def apply(
    dataLocationResource: Option[software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLocationResourceProperty] = None,
    tableWithColumnsResource: Option[software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWithColumnsResourceProperty] = None,
    tableResource: Option[software.amazon.awscdk.services.lakeformation.CfnPermissions.TableResourceProperty] = None,
    databaseResource: Option[software.amazon.awscdk.services.lakeformation.CfnPermissions.DatabaseResourceProperty] = None
  ): software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty =
    (new software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty.Builder)
      .dataLocationResource(dataLocationResource.orNull)
      .tableWithColumnsResource(tableWithColumnsResource.orNull)
      .tableResource(tableResource.orNull)
      .databaseResource(databaseResource.orNull)
      .build()
}
