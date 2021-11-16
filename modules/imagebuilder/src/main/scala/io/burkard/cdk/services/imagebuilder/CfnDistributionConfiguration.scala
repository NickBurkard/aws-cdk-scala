package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDistributionConfiguration {

  def apply(
    internalResourceId: String,
    name: String,
    distributions: List[_],
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration =
    software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .distributions(distributions.asJava)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
