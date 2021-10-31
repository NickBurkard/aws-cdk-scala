package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnByteMatchSet {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    byteMatchTuples: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.CfnByteMatchSet =
    software.amazon.awscdk.services.waf.CfnByteMatchSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .byteMatchTuples(byteMatchTuples.map(_.asJava).orNull)
      .build()
}
