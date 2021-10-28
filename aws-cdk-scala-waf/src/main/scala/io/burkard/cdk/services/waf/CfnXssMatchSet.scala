package io.burkard.cdk.services.waf

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnXssMatchSet {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    xssMatchTuples: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.CfnXssMatchSet =
    software.amazon.awscdk.services.waf.CfnXssMatchSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .xssMatchTuples(xssMatchTuples.map(_.asJava).orNull)
      .build()
}
