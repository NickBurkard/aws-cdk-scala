package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TemplateSourceTemplateProperty {

  def apply(
    arn: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnTemplate.TemplateSourceTemplateProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTemplate.TemplateSourceTemplateProperty.Builder)
      .arn(arn.orNull)
      .build()
}
