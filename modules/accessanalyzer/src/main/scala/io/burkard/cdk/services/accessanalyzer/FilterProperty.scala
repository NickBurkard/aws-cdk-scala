package io.burkard.cdk.services.accessanalyzer

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FilterProperty {

  def apply(
    property: String,
    exists: Option[Boolean] = None,
    contains: Option[List[String]] = None,
    eq: Option[List[String]] = None,
    neq: Option[List[String]] = None
  ): software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty =
    (new software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty.Builder)
      .property(property)
      .exists(exists.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .contains(contains.map(_.asJava).orNull)
      .eq(eq.map(_.asJava).orNull)
      .neq(neq.map(_.asJava).orNull)
      .build()
}
