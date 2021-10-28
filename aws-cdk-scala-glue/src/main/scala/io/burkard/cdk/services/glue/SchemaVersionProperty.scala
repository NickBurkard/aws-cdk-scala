package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SchemaVersionProperty {

  def apply(
    versionNumber: Option[Number] = None,
    isLatest: Option[Boolean] = None
  ): software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty =
    (new software.amazon.awscdk.services.glue.CfnSchema.SchemaVersionProperty.Builder)
      .versionNumber(versionNumber.orNull)
      .isLatest(isLatest.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
