package io.burkard.cdk.services.route53recoveryreadiness

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceSetProps {

  def apply(
    resourceSetType: String,
    resourceSetName: String,
    resources: List[_],
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps =
    (new software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps.Builder)
      .resourceSetType(resourceSetType)
      .resourceSetName(resourceSetName)
      .resources(resources.asJava)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
