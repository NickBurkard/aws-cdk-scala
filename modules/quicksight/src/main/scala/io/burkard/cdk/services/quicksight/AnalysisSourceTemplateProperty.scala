package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AnalysisSourceTemplateProperty {

  def apply(
    arn: String,
    dataSetReferences: List[_]
  ): software.amazon.awscdk.services.quicksight.CfnAnalysis.AnalysisSourceTemplateProperty =
    (new software.amazon.awscdk.services.quicksight.CfnAnalysis.AnalysisSourceTemplateProperty.Builder)
      .arn(arn)
      .dataSetReferences(dataSetReferences.asJava)
      .build()
}
