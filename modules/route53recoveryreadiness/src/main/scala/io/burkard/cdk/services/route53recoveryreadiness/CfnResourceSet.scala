package io.burkard.cdk.services.route53recoveryreadiness

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceSet {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    resourceSetType: Option[String] = None,
    resourceSetName: Option[String] = None,
    resources: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet =
    software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .resourceSetType(resourceSetType.orNull)
      .resourceSetName(resourceSetName.orNull)
      .resources(resources.map(_.asJava).orNull)
      .build()
}
