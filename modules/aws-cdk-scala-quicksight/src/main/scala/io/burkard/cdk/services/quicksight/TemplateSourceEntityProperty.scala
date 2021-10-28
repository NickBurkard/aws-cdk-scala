package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TemplateSourceEntityProperty {

  def apply(
    sourceAnalysis: Option[software.amazon.awscdk.services.quicksight.CfnTemplate.TemplateSourceAnalysisProperty] = None,
    sourceTemplate: Option[software.amazon.awscdk.services.quicksight.CfnTemplate.TemplateSourceTemplateProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnTemplate.TemplateSourceEntityProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTemplate.TemplateSourceEntityProperty.Builder)
      .sourceAnalysis(sourceAnalysis.orNull)
      .sourceTemplate(sourceTemplate.orNull)
      .build()
}
