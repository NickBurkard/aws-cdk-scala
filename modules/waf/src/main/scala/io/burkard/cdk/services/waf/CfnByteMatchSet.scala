package io.burkard.cdk.services.waf

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
