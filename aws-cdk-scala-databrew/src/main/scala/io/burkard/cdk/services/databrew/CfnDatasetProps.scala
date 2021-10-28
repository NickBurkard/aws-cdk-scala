package io.burkard.cdk.services.databrew

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDatasetProps {

  def apply(
    format: Option[String] = None,
    name: Option[String] = None,
    pathOptions: Option[software.amazon.awscdk.services.databrew.CfnDataset.PathOptionsProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    formatOptions: Option[software.amazon.awscdk.services.databrew.CfnDataset.FormatOptionsProperty] = None,
    input: Option[software.amazon.awscdk.services.databrew.CfnDataset.InputProperty] = None
  ): software.amazon.awscdk.services.databrew.CfnDatasetProps =
    (new software.amazon.awscdk.services.databrew.CfnDatasetProps.Builder)
      .format(format.orNull)
      .name(name.orNull)
      .pathOptions(pathOptions.orNull)
      .tags(tags.map(_.asJava).orNull)
      .formatOptions(formatOptions.orNull)
      .input(input.orNull)
      .build()
}
