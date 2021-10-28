package io.burkard.cdk.services.codecommit

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Repository {

  def apply(
    internalResourceId: String,
    repositoryName: Option[String] = None,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codecommit.Repository =
    software.amazon.awscdk.services.codecommit.Repository.Builder
      .create(stackCtx, internalResourceId)
      .repositoryName(repositoryName.orNull)
      .description(description.orNull)
      .build()
}
