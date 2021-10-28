package io.burkard.cdk.services.datapipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FieldProperty {

  def apply(
    key: Option[String] = None,
    stringValue: Option[String] = None,
    refValue: Option[String] = None
  ): software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty =
    (new software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty.Builder)
      .key(key.orNull)
      .stringValue(stringValue.orNull)
      .refValue(refValue.orNull)
      .build()
}
