package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3KeyFilterRuleProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterRuleProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterRuleProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
