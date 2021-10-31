package io.burkard.cdk.services.waf

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSizeConstraintSet {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    sizeConstraints: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.CfnSizeConstraintSet =
    software.amazon.awscdk.services.waf.CfnSizeConstraintSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .sizeConstraints(sizeConstraints.map(_.asJava).orNull)
      .build()
}
