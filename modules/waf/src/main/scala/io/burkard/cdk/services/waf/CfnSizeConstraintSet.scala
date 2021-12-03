package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSizeConstraintSet {

  def apply(
    internalResourceId: String,
    name: String,
    sizeConstraints: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet =
    software.amazon.awscdk.services.waf.regional.CfnSizeConstraintSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .sizeConstraints(sizeConstraints.map(_.asJava).orNull)
      .build()
}
