package io.burkard.cdk.services.quicksight

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAnalysis {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    awsAccountId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    permissions: Option[List[_]] = None,
    errors: Option[List[_]] = None,
    analysisId: Option[String] = None,
    themeArn: Option[String] = None,
    parameters: Option[software.amazon.awscdk.services.quicksight.CfnAnalysis.ParametersProperty] = None,
    sourceEntity: Option[software.amazon.awscdk.services.quicksight.CfnAnalysis.AnalysisSourceEntityProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.quicksight.CfnAnalysis =
    software.amazon.awscdk.services.quicksight.CfnAnalysis.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .awsAccountId(awsAccountId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .permissions(permissions.map(_.asJava).orNull)
      .errors(errors.map(_.asJava).orNull)
      .analysisId(analysisId.orNull)
      .themeArn(themeArn.orNull)
      .parameters(parameters.orNull)
      .sourceEntity(sourceEntity.orNull)
      .build()
}
