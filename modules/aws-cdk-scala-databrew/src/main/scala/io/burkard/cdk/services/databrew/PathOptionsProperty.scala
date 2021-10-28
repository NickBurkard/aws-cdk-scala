package io.burkard.cdk.services.databrew

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
