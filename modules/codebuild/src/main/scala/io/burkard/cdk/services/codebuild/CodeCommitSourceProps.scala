package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CodeCommitSourceProps {

  def apply(
    repository: software.amazon.awscdk.services.codecommit.IRepository,
    identifier: Option[String] = None,
    branchOrRef: Option[String] = None,
    cloneDepth: Option[Number] = None,
    fetchSubmodules: Option[Boolean] = None
  ): software.amazon.awscdk.services.codebuild.CodeCommitSourceProps =
    (new software.amazon.awscdk.services.codebuild.CodeCommitSourceProps.Builder)
      .repository(repository)
      .identifier(identifier.orNull)
      .branchOrRef(branchOrRef.orNull)
      .cloneDepth(cloneDepth.orNull)
      .fetchSubmodules(fetchSubmodules.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
