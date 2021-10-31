package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PathOptionsProperty {

  def apply(
    lastModifiedDateCondition: Option[software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty] = None,
    filesLimit: Option[software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty] = None,
    parameters: Option[List[_]] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.PathOptionsProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.PathOptionsProperty.Builder)
      .lastModifiedDateCondition(lastModifiedDateCondition.orNull)
      .filesLimit(filesLimit.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
