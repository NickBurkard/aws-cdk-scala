package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDataset {

  def apply(
    internalResourceId: String,
    format: Option[String] = None,
    name: Option[String] = None,
    pathOptions: Option[software.amazon.awscdk.services.databrew.CfnDataset.PathOptionsProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    formatOptions: Option[software.amazon.awscdk.services.databrew.CfnDataset.FormatOptionsProperty] = None,
    input: Option[software.amazon.awscdk.services.databrew.CfnDataset.InputProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.databrew.CfnDataset =
    software.amazon.awscdk.services.databrew.CfnDataset.Builder
      .create(stackCtx, internalResourceId)
      .format(format.orNull)
      .name(name.orNull)
      .pathOptions(pathOptions.orNull)
      .tags(tags.map(_.asJava).orNull)
      .formatOptions(formatOptions.orNull)
      .input(input.orNull)
      .build()
}
