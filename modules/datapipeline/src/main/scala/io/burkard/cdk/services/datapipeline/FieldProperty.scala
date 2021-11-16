package io.burkard.cdk.services.datapipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FieldProperty {

  def apply(
    key: String,
    stringValue: Option[String] = None,
    refValue: Option[String] = None
  ): software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty =
    (new software.amazon.awscdk.services.datapipeline.CfnPipeline.FieldProperty.Builder)
      .key(key)
      .stringValue(stringValue.orNull)
      .refValue(refValue.orNull)
      .build()
}
