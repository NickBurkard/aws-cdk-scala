package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TemplateSourceTemplateProperty {

  def apply(
    arn: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnTemplate.TemplateSourceTemplateProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTemplate.TemplateSourceTemplateProperty.Builder)
      .arn(arn.orNull)
      .build()
}
