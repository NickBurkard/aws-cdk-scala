package io.burkard.cdk.services.route53recoveryreadiness

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnResourceSet {

  def apply(
    internalResourceId: String,
    resourceSetType: String,
    resourceSetName: String,
    resources: List[_],
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet =
    software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.Builder
      .create(stackCtx, internalResourceId)
      .resourceSetType(resourceSetType)
      .resourceSetName(resourceSetName)
      .resources(resources.asJava)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
