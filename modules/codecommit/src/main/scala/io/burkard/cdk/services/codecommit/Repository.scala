package io.burkard.cdk.services.codecommit

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Repository {

  def apply(
    internalResourceId: String,
    repositoryName: String,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codecommit.Repository =
    software.amazon.awscdk.services.codecommit.Repository.Builder
      .create(stackCtx, internalResourceId)
      .repositoryName(repositoryName)
      .description(description.orNull)
      .build()
}
