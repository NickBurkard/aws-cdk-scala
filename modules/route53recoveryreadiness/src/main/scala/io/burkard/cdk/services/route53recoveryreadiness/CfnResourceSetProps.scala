package io.burkard.cdk.services.route53recoveryreadiness

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnResourceSetProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    resourceSetType: Option[String] = None,
    resourceSetName: Option[String] = None,
    resources: Option[List[_]] = None
  ): software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps =
    (new software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .resourceSetType(resourceSetType.orNull)
      .resourceSetName(resourceSetName.orNull)
      .resources(resources.map(_.asJava).orNull)
      .build()
}
