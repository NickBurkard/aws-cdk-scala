package io.burkard.cdk.services.lakeformation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DataLocationResourceProperty {

  def apply(
    s3Resource: Option[String] = None,
    catalogId: Option[String] = None
  ): software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLocationResourceProperty =
    (new software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLocationResourceProperty.Builder)
      .s3Resource(s3Resource.orNull)
      .catalogId(catalogId.orNull)
      .build()
}
