package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRulesetProps {

  def apply(
    name: String,
    targetArn: String,
    rules: List[_],
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.databrew.CfnRulesetProps =
    (new software.amazon.awscdk.services.databrew.CfnRulesetProps.Builder)
      .name(name)
      .targetArn(targetArn)
      .rules(rules.asJava)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
