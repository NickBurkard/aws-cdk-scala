package io.burkard.cdk.services.quicksight

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAnalysis {

  def apply(
    internalResourceId: String,
    awsAccountId: String,
    analysisId: String,
    sourceEntity: software.amazon.awscdk.services.quicksight.CfnAnalysis.AnalysisSourceEntityProperty,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    permissions: Option[List[_]] = None,
    errors: Option[List[_]] = None,
    themeArn: Option[String] = None,
    parameters: Option[software.amazon.awscdk.services.quicksight.CfnAnalysis.ParametersProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.quicksight.CfnAnalysis =
    software.amazon.awscdk.services.quicksight.CfnAnalysis.Builder
      .create(stackCtx, internalResourceId)
      .awsAccountId(awsAccountId)
      .analysisId(analysisId)
      .sourceEntity(sourceEntity)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .errors(errors.map(_.asJava).orNull)
      .themeArn(themeArn.orNull)
      .parameters(parameters.orNull)
      .build()
}
