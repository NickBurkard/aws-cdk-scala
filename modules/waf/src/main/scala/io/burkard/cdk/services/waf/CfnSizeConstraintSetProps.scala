package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSizeConstraintSetProps {

  def apply(
    name: String,
    sizeConstraints: List[_]
  ): software.amazon.awscdk.services.waf.CfnSizeConstraintSetProps =
    (new software.amazon.awscdk.services.waf.CfnSizeConstraintSetProps.Builder)
      .name(name)
      .sizeConstraints(sizeConstraints.asJava)
      .build()
}
