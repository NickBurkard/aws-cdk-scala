package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnByteMatchSetProps {

  def apply(
    name: Option[String] = None,
    byteMatchTuples: Option[List[_]] = None
  ): software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps =
    (new software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps.Builder)
      .name(name.orNull)
      .byteMatchTuples(byteMatchTuples.map(_.asJava).orNull)
      .build()
}
