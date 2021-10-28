package io.burkard.cdk.services.accessanalyzer

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FilterProperty {

  def apply(
    exists: Option[Boolean] = None,
    property: Option[String] = None,
    contains: Option[List[String]] = None,
    eq: Option[List[String]] = None,
    neq: Option[List[String]] = None
  ): software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty =
    (new software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer.FilterProperty.Builder)
      .exists(exists.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .property(property.orNull)
      .contains(contains.map(_.asJava).orNull)
      .eq(eq.map(_.asJava).orNull)
      .neq(neq.map(_.asJava).orNull)
      .build()
}
