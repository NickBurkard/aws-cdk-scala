package io.burkard.cdk.services.waf

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
