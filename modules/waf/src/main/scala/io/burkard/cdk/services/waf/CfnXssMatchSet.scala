package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnXssMatchSet {

  def apply(
    internalResourceId: String,
    name: String,
    xssMatchTuples: List[_]
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.CfnXssMatchSet =
    software.amazon.awscdk.services.waf.CfnXssMatchSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .xssMatchTuples(xssMatchTuples.asJava)
      .build()
}
