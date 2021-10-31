package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDistributionConfiguration {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    distributions: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration =
    software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .distributions(distributions.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
