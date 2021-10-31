package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubjectAlternativeNamesMatcherConfig {

  def apply(
    subjectAlternativeNamesMatch: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.SubjectAlternativeNameMatchersProperty] = None
  ): software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig =
    (new software.amazon.awscdk.services.appmesh.SubjectAlternativeNamesMatcherConfig.Builder)
      .subjectAlternativeNamesMatch(subjectAlternativeNamesMatch.orNull)
      .build()
}
