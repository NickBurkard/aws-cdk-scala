package io.burkard.cdk.services.quicksight

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TemplateSourceAnalysisProperty {

  def apply(
    arn: Option[String] = None,
    dataSetReferences: Option[List[_]] = None
  ): software.amazon.awscdk.services.quicksight.CfnTemplate.TemplateSourceAnalysisProperty =
    (new software.amazon.awscdk.services.quicksight.CfnTemplate.TemplateSourceAnalysisProperty.Builder)
      .arn(arn.orNull)
      .dataSetReferences(dataSetReferences.map(_.asJava).orNull)
      .build()
}
